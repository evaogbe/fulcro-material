(ns ogbe.fulcro.mui.surfaces.accordion
  #?(:cljs (:require
            ["@mui/material/Accordion" :default Accordion]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-accordion #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory Accordion)))
