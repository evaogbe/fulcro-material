(ns ogbe.fulcro.mui.icons.label-important
  #?(:cljs (:require
            ["@mui/icons-material/LabelImportant" :default LabelImportant]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-label-important
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LabelImportant)))