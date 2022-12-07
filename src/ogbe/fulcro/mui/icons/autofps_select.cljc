(ns ogbe.fulcro.mui.icons.autofps-select
  #?(:cljs (:require
            ["@mui/icons-material/AutofpsSelect" :default AutofpsSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-autofps-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutofpsSelect)))