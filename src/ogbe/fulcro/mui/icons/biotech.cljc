(ns ogbe.fulcro.mui.icons.biotech
  #?(:cljs (:require
            ["@mui/icons-material/Biotech" :default Biotech]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-biotech
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Biotech)))