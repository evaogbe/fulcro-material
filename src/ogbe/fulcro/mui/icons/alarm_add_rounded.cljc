(ns ogbe.fulcro.mui.icons.alarm-add-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AlarmAddRounded" :default AlarmAddRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-add-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmAddRounded)))