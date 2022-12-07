(ns ogbe.fulcro.mui.icons.alarm-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AlarmOutlined" :default AlarmOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmOutlined)))