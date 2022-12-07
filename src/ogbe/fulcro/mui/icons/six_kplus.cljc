(ns ogbe.fulcro.mui.icons.six-kplus
  #?(:cljs (:require
            ["@mui/icons-material/SixKPlus" :default SixKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-six-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SixKPlus)))