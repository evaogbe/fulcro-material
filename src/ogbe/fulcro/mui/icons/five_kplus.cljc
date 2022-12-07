(ns ogbe.fulcro.mui.icons.five-kplus
  #?(:cljs (:require
            ["@mui/icons-material/FiveKPlus" :default FiveKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-five-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FiveKPlus)))