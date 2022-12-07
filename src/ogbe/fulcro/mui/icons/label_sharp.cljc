(ns ogbe.fulcro.mui.icons.label-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LabelSharp" :default LabelSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-label-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LabelSharp)))