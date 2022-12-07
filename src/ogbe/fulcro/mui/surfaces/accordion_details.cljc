(ns ogbe.fulcro.mui.surfaces.accordion-details
  #?(:cljs (:require
            ["@mui/material/AccordionDetails" :default AccordionDetails]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-accordion-details #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory AccordionDetails)))
