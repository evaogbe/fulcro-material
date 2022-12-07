(ns ogbe.fulcro.mui.icons.filter-hdr
  #?(:cljs (:require
            ["@mui/icons-material/FilterHdr" :default FilterHdr]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-filter-hdr
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FilterHdr)))