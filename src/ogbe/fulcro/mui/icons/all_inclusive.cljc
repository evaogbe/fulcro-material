(ns ogbe.fulcro.mui.icons.all-inclusive
  #?(:cljs (:require
            ["@mui/icons-material/AllInclusive" :default AllInclusive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-all-inclusive
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AllInclusive)))