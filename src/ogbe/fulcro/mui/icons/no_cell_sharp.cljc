(ns ogbe.fulcro.mui.icons.no-cell-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NoCellSharp" :default NoCellSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-cell-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoCellSharp)))