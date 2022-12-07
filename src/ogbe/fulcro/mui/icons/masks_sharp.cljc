(ns ogbe.fulcro.mui.icons.masks-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MasksSharp" :default MasksSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-masks-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MasksSharp)))