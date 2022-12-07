(ns ogbe.fulcro.mui.icons.view-carousel
  #?(:cljs (:require
            ["@mui/icons-material/ViewCarousel" :default ViewCarousel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-carousel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewCarousel)))