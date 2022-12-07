(ns ogbe.fulcro.mui.icons.tour-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TourOutlined" :default TourOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tour-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TourOutlined)))