(ns ogbe.fulcro.mui.icons.takeout-dining
  #?(:cljs (:require
            ["@mui/icons-material/TakeoutDining" :default TakeoutDining]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-takeout-dining
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TakeoutDining)))