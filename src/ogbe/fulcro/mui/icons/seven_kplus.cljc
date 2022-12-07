(ns ogbe.fulcro.mui.icons.seven-kplus
  #?(:cljs (:require
            ["@mui/icons-material/SevenKPlus" :default SevenKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-seven-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SevenKPlus)))