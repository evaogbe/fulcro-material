(ns ogbe.fulcro.mui.date-pickers.localization-provider
  #?(:cljs
     (:require
      ["@mui/x-date-pickers/LocalizationProvider" :refer [LocalizationProvider]]
      [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-localization-provider #?(:clj  (fn [& _args])
                                 :cljs (interop/react-factory LocalizationProvider)))
