(ns ogbe.fulcro.mui.icons.select-all-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SelectAllRounded" :default SelectAllRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-select-all-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SelectAllRounded)))