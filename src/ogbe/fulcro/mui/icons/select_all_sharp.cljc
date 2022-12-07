(ns ogbe.fulcro.mui.icons.select-all-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SelectAllSharp" :default SelectAllSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-select-all-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SelectAllSharp)))