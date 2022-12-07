(ns ogbe.fulcro.mui.icons.masks-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MasksTwoTone" :default MasksTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-masks-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MasksTwoTone)))