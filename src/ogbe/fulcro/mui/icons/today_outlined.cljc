(ns ogbe.fulcro.mui.icons.today-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TodayOutlined" :default TodayOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-today-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TodayOutlined)))