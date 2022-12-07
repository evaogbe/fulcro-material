(ns ogbe.fulcro.mui.icons.golf-course
  #?(:cljs (:require
            ["@mui/icons-material/GolfCourse" :default GolfCourse]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-golf-course
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GolfCourse)))