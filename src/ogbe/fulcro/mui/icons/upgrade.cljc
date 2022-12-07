(ns ogbe.fulcro.mui.icons.upgrade
  #?(:cljs (:require
            ["@mui/icons-material/Upgrade" :default Upgrade]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upgrade
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Upgrade)))