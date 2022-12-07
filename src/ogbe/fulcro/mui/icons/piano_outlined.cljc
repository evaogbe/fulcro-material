(ns ogbe.fulcro.mui.icons.piano-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PianoOutlined" :default PianoOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-piano-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PianoOutlined)))