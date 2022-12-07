(ns ogbe.fulcro.mui.icons.access-alarms
  #?(:cljs (:require
            ["@mui/icons-material/AccessAlarms" :default AccessAlarms]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-access-alarms
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessAlarms)))