(ns ogbe.fulcro.mui.icons.upgrade-rounded
  #?(:cljs (:require
            ["@mui/icons-material/UpgradeRounded" :default UpgradeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upgrade-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UpgradeRounded)))