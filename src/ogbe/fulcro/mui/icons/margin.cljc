(ns ogbe.fulcro.mui.icons.margin
  #?(:cljs (:require
            ["@mui/icons-material/Margin" :default Margin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-margin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Margin)))