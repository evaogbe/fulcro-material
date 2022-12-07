(ns ogbe.fulcro.mui.icons.access-alarm
  #?(:cljs (:require
            ["@mui/icons-material/AccessAlarm" :default AccessAlarm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-access-alarm
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessAlarm)))