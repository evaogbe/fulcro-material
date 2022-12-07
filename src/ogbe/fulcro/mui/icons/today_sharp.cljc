(ns ogbe.fulcro.mui.icons.today-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TodaySharp" :default TodaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-today-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TodaySharp)))