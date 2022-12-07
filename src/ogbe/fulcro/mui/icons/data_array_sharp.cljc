(ns ogbe.fulcro.mui.icons.data-array-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DataArraySharp" :default DataArraySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-array-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataArraySharp)))