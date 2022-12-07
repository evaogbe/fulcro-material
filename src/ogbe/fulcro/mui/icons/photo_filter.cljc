(ns ogbe.fulcro.mui.icons.photo-filter
  #?(:cljs (:require
            ["@mui/icons-material/PhotoFilter" :default PhotoFilter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-filter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoFilter)))