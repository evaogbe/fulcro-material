(ns ogbe.fulcro.mui.icons.lock-open-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LockOpenSharp" :default LockOpenSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-open-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockOpenSharp)))