(ns ogbe.fulcro.mui.utils.slide
  #?(:cljs (:require
            ["@mui/material/Slide" :default Slide]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-slide #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Slide)))
