(ns ogbe.fulcro.mui.surfaces.accordion-actions
  #?(:cljs (:require
            ["@mui/material/AccordionActions" :default AccordionActions]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-accordion-actions #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory AccordionActions)))
