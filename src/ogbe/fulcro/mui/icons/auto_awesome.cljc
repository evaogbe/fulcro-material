(ns ogbe.fulcro.mui.icons.auto-awesome
  #?(:cljs (:require
            ["@mui/icons-material/AutoAwesome" :default AutoAwesome]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-awesome
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoAwesome)))