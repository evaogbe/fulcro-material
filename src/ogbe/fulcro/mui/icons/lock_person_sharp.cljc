(ns ogbe.fulcro.mui.icons.lock-person-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LockPersonSharp" :default LockPersonSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-person-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockPersonSharp)))