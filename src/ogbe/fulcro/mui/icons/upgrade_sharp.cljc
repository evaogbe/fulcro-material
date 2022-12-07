(ns ogbe.fulcro.mui.icons.upgrade-sharp
  #?(:cljs (:require
            ["@mui/icons-material/UpgradeSharp" :default UpgradeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-upgrade-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UpgradeSharp)))