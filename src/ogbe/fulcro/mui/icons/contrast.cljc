(ns ogbe.fulcro.mui.icons.contrast
  #?(:cljs (:require
            ["@mui/icons-material/Contrast" :default Contrast]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contrast
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Contrast)))