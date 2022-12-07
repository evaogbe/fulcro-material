(ns ogbe.fulcro.mui.icons.today-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TodayTwoTone" :default TodayTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-today-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TodayTwoTone)))