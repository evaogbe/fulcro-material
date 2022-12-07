(ns ogbe.fulcro.mui.icons.photo-filter-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhotoFilterRounded" :default PhotoFilterRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-filter-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoFilterRounded)))