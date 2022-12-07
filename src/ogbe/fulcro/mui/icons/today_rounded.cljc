(ns ogbe.fulcro.mui.icons.today-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TodayRounded" :default TodayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-today-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TodayRounded)))