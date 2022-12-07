(ns ogbe.fulcro.mui.icons.four-kplus
  #?(:cljs (:require
            ["@mui/icons-material/FourKPlus" :default FourKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-four-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FourKPlus)))