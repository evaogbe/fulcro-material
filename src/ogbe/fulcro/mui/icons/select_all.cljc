(ns ogbe.fulcro.mui.icons.select-all
  #?(:cljs (:require
            ["@mui/icons-material/SelectAll" :default SelectAll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-select-all
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SelectAll)))