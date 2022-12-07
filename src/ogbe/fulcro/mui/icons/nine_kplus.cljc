(ns ogbe.fulcro.mui.icons.nine-kplus
  #?(:cljs (:require
            ["@mui/icons-material/NineKPlus" :default NineKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nine-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NineKPlus)))