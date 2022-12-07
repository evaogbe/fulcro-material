(ns ogbe.fulcro.mui.surfaces.accordion-summary
  #?(:cljs (:require
            ["@mui/material/AccordionSummary" :default AccordionSummary]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-accordion-summary #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory AccordionSummary)))
