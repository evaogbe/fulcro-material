(ns ogbe.fulcro.mui.icons.one-kplus
  #?(:cljs (:require
            ["@mui/icons-material/OneKPlus" :default OneKPlus]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-one-kplus
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OneKPlus)))