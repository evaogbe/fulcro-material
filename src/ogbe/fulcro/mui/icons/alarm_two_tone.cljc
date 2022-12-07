(ns ogbe.fulcro.mui.icons.alarm-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AlarmTwoTone" :default AlarmTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmTwoTone)))