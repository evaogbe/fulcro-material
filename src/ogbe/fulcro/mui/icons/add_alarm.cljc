(ns ogbe.fulcro.mui.icons.add-alarm
  #?(:cljs (:require
            ["@mui/icons-material/AddAlarm" :default AddAlarm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-alarm
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddAlarm)))