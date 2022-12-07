(ns ogbe.fulcro.mui.icons.lock-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LockSharp" :default LockSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockSharp)))