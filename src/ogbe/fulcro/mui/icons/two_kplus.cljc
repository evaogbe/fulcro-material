(ns ogbe.fulcro.mui.icons.two-kplus
  #?(:cljs (:require
            ["@mui/icons-material/TwoKPlus" :default TwoKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-two-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TwoKPlus)))