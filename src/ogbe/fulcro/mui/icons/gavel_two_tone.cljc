(ns ogbe.fulcro.mui.icons.gavel-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/GavelTwoTone" :default GavelTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gavel-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GavelTwoTone)))