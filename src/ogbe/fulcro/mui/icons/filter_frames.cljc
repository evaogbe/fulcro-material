(ns ogbe.fulcro.mui.icons.filter-frames
  #?(:cljs (:require
            ["@mui/icons-material/FilterFrames" :default FilterFrames]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-frames
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterFrames)))