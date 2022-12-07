(ns ogbe.fulcro.mui.icons.remember-me
  #?(:cljs (:require
            ["@mui/icons-material/RememberMe" :default RememberMe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remember-me
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RememberMe)))